package com.ybg.rbac.user.service;
import java.util.List;
import com.ybg.base.jdbc.BaseMap;
import com.ybg.base.util.Page;
import com.ybg.rbac.user.domain.User;
import com.ybg.rbac.user.qvo.UserQvo;

public interface UserService {
	
	/** 返回主键的创建
	 * 
	 * @throws Exception **/
	// sys_user
	User createandid(User user) throws Exception;
	
	/** 更新数据，条件 和 需要更新的字段都不能为空 不限个数个条件
	 * 
	 * @author Deament
	 * @param updatemap
	 *            需要更新的字段和值
	 * @param wheremap
	 *            更新中的条件字段和值
	 * @param table_name
	 *            表的名称 **/
	// sys_user
	void update(BaseMap<String, Object> updatemap, BaseMap<String, Object> wheremap);
	
	/** 分页查询 **/
	// sys_user
	Page query(Page page, UserQvo qvo);
	
	/** 不分页查询 **/
	// sys_user
	List<User> query(UserQvo qvo);
	
	/** 登陆 **/
	// sys_user
	User login(String loginname);
	
	void remove(BaseMap<String, Object> wheremap);
	
	/** 清楚注册不激活的用户 **/
	void removeExpired();
	
	void removebyid(String id);
	
	User get(String id);
	
	/** 查询账户是否已存在 **/
	boolean checkisExist(UserQvo qvo);
}
