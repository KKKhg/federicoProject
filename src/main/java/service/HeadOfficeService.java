package service;

import vo.HeadOfficeVO;
import vo.IteminfoVO;
import vo.StaffVO;

public interface HeadOfficeService {
	
	int iteminsert(IteminfoVO vo); //자재정보 입력
	
	HeadOfficeVO loginSelectOne(HeadOfficeVO vo); //로그인시 id로 selectOne
	
	StaffVO selectOne(StaffVO vo); //staffVO selectOne
	
}
