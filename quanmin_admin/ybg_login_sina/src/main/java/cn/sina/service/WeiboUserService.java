package cn.sina.service;
import java.util.List;
import java.util.Map;
import com.ybg.base.jdbc.BaseMap;
import cn.sina.domain.WeiboUser;
import cn.sina.qvo.WeiboUserQvo;

public interface WeiboUserService {
	
	void create(WeiboUser bean) throws Exception;
	
	void update(BaseMap<String, Object> updatemap, BaseMap<String, Object> wheremap);
	
	void remove(BaseMap<String, Object> wheremap);
	
	List<WeiboUser> query(WeiboUserQvo qvo);
	
	WeiboUser get(String uid);
	
	Map<String, String> getSetting();
}
