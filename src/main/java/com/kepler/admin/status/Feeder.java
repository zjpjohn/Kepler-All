package com.kepler.admin.status;

import java.util.Map;

import com.kepler.annotation.Service;
import com.kepler.host.Host;

/**
 * @author kim 2015年8月8日
 */
@Service(version = "0.0.1")
public interface Feeder {

	/**
	 * @param local 主机
	 * @param status 状态集合
	 */
	public void feed(Host local, Map<String, Object> status);
}
