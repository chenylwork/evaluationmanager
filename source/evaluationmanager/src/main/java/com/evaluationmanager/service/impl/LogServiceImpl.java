package com.evaluationmanager.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.LogDao;
import com.evaluationmanager.entiy.LoginLog;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.service.LogService;
import com.evaluationmanager.support.AbstractService;
import com.google.gson.Gson;


/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-下午1:49:18
 * @Description 描述信息：登录日志ServiceImpl
 *
 */
@Service("logService")
public class LogServiceImpl extends AbstractService<LoginLog> implements LogService{
	@Autowired
	private LogDao logDao;
	@Autowired
	private Gson gson;
	@Override
	@Transactional
	public boolean add(User user,HttpServletRequest request ) {
		LoginLog loginLog = new LoginLog();
		Date day=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		loginLog.setUser(user.getAccount());
		loginLog.setLoginTime(df.format(day));
		loginLog.setIp(getIpAddr(request));
		return logDao.add(loginLog);
	}

	@Override
	@Transactional
	public boolean update(LoginLog loginLog) {
		return logDao.update(loginLog);
	}

	@Override
	@Transactional
	public boolean delete(LoginLog loginLog) {
		return logDao.delete(loginLog);
	}

	@Override
	@Transactional
	public List<LoginLog> getAll() {
		List<LoginLog> loginLog=logDao.getDatas("");
		return loginLog;
	}

	@Override
	@Transactional
	public LoginLog getLoginLogByID(long id) {
		return logDao.getDataByID(id);
	}
	/**@Override
	public List<Map<String, Object>> paginGet(Pagin<Map<String,Object>> pagin, String conditions, String... params) {
		// 获取总个数
		pagin.setCount(logDao.size(conditions, params));
		// 获取数据
		return logDao.paginGetMapDatas(pagin, conditions, params);
	}**/
	@Override
	@Transactional()
	public String paginSearch(Pagin<Map<String, Object>> pagin,LoginLog loginLog) {
		pagin.setCount(logDao.size(loginLog));
		logDao.paginSearchMajor(pagin, loginLog);
		return gson.toJson(pagin);
	}
	
	@Override
	public int batchDelete(String[] params) {
		List<String[]> paramList = new ArrayList<>();
		for(String string : params) {
			System.out.println(string);
			paramList.add(new String[]{string});
		}
		return logDao.batchDelete(paramList);
	}
	//获取真实ip
	public static String getIpAddr(HttpServletRequest request) {
		String ipAddress = request.getHeader("x-forwarded-for");
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
		ipAddress = request.getHeader("Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
		ipAddress = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
		ipAddress = request.getRemoteAddr();
		if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
		// 根据网卡取本机配置的IP
		InetAddress inet = null;
		try {
		inet = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
		e.printStackTrace();
		}
		ipAddress = inet.getHostAddress();
		}
		}
		// 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
		if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
		// = 15
		if (ipAddress.indexOf(",") > 0) {
		ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
		}
		}
		return ipAddress;
		}

}
