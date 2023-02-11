package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import model.MemberVO;
import model.ScheduleVO;

public class View {

	//----------------------------------------------------------------
	//메인메뉴 출력 로직

	public Scanner sc ;
	public View(){
		sc = new Scanner(System.in);
	}

	public int printStart(){
		int act;
		while(true) {
			try{
				System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯  비나이다 비나이다  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
				System.out.println("1.   로그인");
				System.out.println("2.   회원가입");
				System.out.println("3.   종료");
				System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
				System.out.print("   :::   ");
				act = sc.nextInt();
			}catch(Exception e){
				sc.nextLine();
				System.out.println("✖︎ ✖︎  입력 범위로 입력해주세요!  ✖ ︎✖︎");
				continue;
			}
			if(1<=act && act <=3){
				break;
			}
			System.out.println();
			System.out.println();
			System.out.println("✖ ︎✖︎  입력 범위로 입력해주세요!  ✖︎ ✖︎");
			System.out.println();
			System.out.println();
		}
		return act;
	}


	//-----------------------------------------------------------
	// 프로그램 종료문구 로직
	public void powerOff() {
		for(int i=0;i<3;i++) {
			System.out.println(" . ");
		}
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println("안녕히가세요. : D");
	}

	//-----------------------------------------------------------------
	//로그아웃 종료문구 로직
	public void logOut() {
		System.out.println("로그아웃되었습니다.  ");
		System.out.println("안녕히가세요 : D ");
	}

	//-------------------------------------------------------
	//로그인 id 입력 로직
	public String getId() {
		System.out.print("ID :  ");
		String id=sc.next();
		return id;
	}

	//-------------------------------------------------------------------------
	//로그인  pw 입력 로직
	public String getPw() {
		System.out.print("PW :  ");
		String pw=sc.next();
		// 비밀번호 재입력 (유효성 검사) 추가하기
		return pw;
	}

	//---------------------------------------------------------
	//로그인 name 입력 로직
	public String getName() {
		System.out.print("NAME : ");
		String pw=sc.next();
		return pw;
	}

	//////////////////////////////////////
	// 회원가입 로그인 성공
	public void joinTure() {
		System.out.println("회원가입 성공되었습니다.");
		System.out.println("로그인 해주세요 : D ");
	}

	//////////////////////////////////////////////////////
	// 회원가입 중복시 로직
	public void idFalse() {
		System.out.println("✖︎ ✖︎ 중복된 아이디 입니다. ✖︎ ✖︎");
	}

	//---------------------------------------------------------------------------------------------
	//로그인 실패시 로직
	public void loginFalse() {
		System.out.println("✖ ︎✖︎ 로그인 실패... ✖︎ ✖︎");
		System.out.println("아이디 or 비밀번호를 다시 확인해보세요!");
	}

	//---------------------------------------------------------------------------------------------
	//로그인 성공 로직
	public void loginTure(MemberVO vo) {
		System.out.println();
		System.out.println("로그인 되었습니다.");
		System.out.println(vo.getName()+"님 안녕하세요 : D ");

	}

	//------------------------------------------------------------------------------------
	//로그인후 회원 메뉴 출력로직  
	public int printMenu() {  //로그인후 회원 메뉴 출력
		int act;
		while(true) {
			try {
				System.out.println();
				System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯  회원 메뉴  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
				System.out.println("1. 일정추가");
				System.out.println("2. 일정출력");
				System.out.println("3. 일정변경");
				System.out.println("4. 일정삭제");
				System.out.println("5. 정보변경");
				System.out.println("6. 회원탈퇴");
				System.out.println("7. 로그아웃");
				System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
				System.out.print("   :::   ");
				act = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("✖︎ ✖︎  입력 범위로 입력해주세요!  ✖ ︎✖");
				continue;
			}
			if(1<=act && act <=7) {
				break;
			}
			System.out.println("✖︎ ✖︎  입력 범위로 입력해주세요!  ✖ ︎✖");
			System.out.println();
		}
		return act;
	}

	///////////////////////////////////////////////////////////////////////////////////
	// 일정 구 입력 로직
	public String gu(ArrayList<String>datas) {
		String gu;
		boolean flag=false;
		System.out.println(datas);
		//유효성검사
		while(true) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 일정 구 입력  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.print("   :::   ");
			gu=sc.next();
			for(int i=0;i<datas.size();i++) {
				if(datas.get(i).equals(gu)) {
					flag=true;
					break;
				}   
			}
			if(flag) {
				break;
			}
		}
		return gu;
	}

	///////////////////////////////////////////////////////////////////////////////////
	// 일정 동 입력 로직
	public String dong(ArrayList<String>datas) {

		String dong;
		boolean flag=false;
		System.out.println(datas);
		//유효성검사
		while(true) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 일정 동 입력  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.print("   :::   ");
			dong=sc.next();
			for(int i=0;i<datas.size();i++) {
				if(datas.get(i).equals(dong)) {
					flag=true;
					break;
				}   
			}
			if(flag) {
				break;
			}
		}		
		return dong;
	}
	//-----------------------------------------------------------------
	//연도 입력 로직
	public int year() {
		LocalDate now = LocalDate.now();
		int year;
		int nowyear = now.getYear();//현재 연도
		while(true) {
			System.out.println();
			System.out.println("날씨정보는 10일 까지만 표시됩니다. : D");
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 일정 연도 입력  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.print("   :::   ");
			try{
				year=sc.nextInt();
			}catch(Exception e){
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("✖︎ ✖︎  입력하신 연도를 다시 확인해주세요!  ✖ ︎✖");
				continue;
			}
			if(year<nowyear) { //현재 연보다 작을경우 컨티뉴
				System.out.println("✖︎ ✖︎  입력하신 연도를 다시 확인해주세요!  ✖ ︎✖");
				continue;
			}
			break;
		}
		return year;
	}
	///////////////////////////////////////////////////////////
	/// 일정 월 입력 로직
	public int mon(int year) {
		LocalDate now = LocalDate.now();
		int mon;
		while(true) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 일정 월 입력  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.print("   :::   ");
			try {
				mon=sc.nextInt();
			}catch (Exception e) {
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("✖︎ ✖︎  입력하신 월을 다시 확인해주세요!  ✖ ︎✖");
				continue;
			}
			if(mon<1 || mon>12 ) {
				System.out.println("✖︎ ✖︎  입력하신 월을 다시 확인해주세요!  ✖ ︎✖");
				continue;            
			}
			if(year==now.getYear()) {
				//현재 월보다작으면 과거이니 다시입력.
				if(mon<now.getMonthValue()) {
					System.out.println("✖︎ ✖︎ 지나간 시간은 다시 되돌릴 수 없습니다..✖︎ ✖︎");
					continue;
				}
			}
			break;
		}
		return mon;
	}

	///////////////////////////////////////////////////////////////////////////////////
	// 일정 일 입력 로직
	public int day(int year,int mon) {
		LocalDate now = LocalDate.now();
		int day;
		while(true) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 일정 일 입력  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.print("   :::   ");
			try {
				day=sc.nextInt();
			}catch (Exception e) {
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("✖︎ ✖︎  입력하신 일을 다시 확인해주세요!  ✖ ︎✖");
				continue;
			}
			if(mon==1 || mon==3|| mon==5 || mon==7 || mon==8 || mon==10 || mon==12  ) {
				if(day<1 || day>31) {
					System.out.println("✖︎ ✖︎  입력하신 일을 다시 확인해주세요!  ✖ ︎✖");
					continue;
				}
				if(year==now.getYear() && mon==now.getMonthValue()&& day<now.getDayOfMonth()) {
					System.out.println("✖︎ ✖︎ 지나간 시간은 다시 되돌릴 수 없습니다.. ✖︎ ✖︎");
					continue;					
				}
				else {
					break;
				}
			}
			else if(mon==4 || mon==6 || mon==9 || mon==11) {
				if(day<1 || day>30) {
					System.out.println("✖︎ ✖︎  입력하신 일을 다시 확인해주세요!  ✖ ︎✖");
					continue;
				}
				if(year==now.getYear() && mon==now.getMonthValue()&& day<now.getDayOfMonth()) {
					System.out.println("✖︎ ✖︎ 지나간 시간은 다시 되돌릴 수 없습니다.. ✖︎ ✖︎");
					continue;					
				}
				else {
					break;
				}
			}
			else if(mon==2) {
				if(day<1 || day>29) {
					System.out.println("✖︎ ✖︎  입력하신 일을 다시 확인해주세요!  ✖ ︎✖");
					continue;
				}
				if(year==now.getYear() && mon==now.getMonthValue()&& day<now.getDayOfMonth()) {
					System.out.println("✖︎ ✖︎ 지나간 시간은 다시 되돌릴 수 없습니다.. ✖︎ ✖︎");
					continue;					
				}
				else {
					break;
				}
			}
		}
		return day;
	}

	////////////////////////////////////////////////////
	/// 일정 입력 로직
	public String diary() {
		System.out.println();

		System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 일정 메모 입력  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
		System.out.print("   :::   ");
		sc.nextLine();
		String dia= sc.nextLine();
		return dia;
	}
	////////////////////일정 등록 성공로직
	//---------------------------------------------------------------------------------
	public void scheduleTrue() { // 
		System.out.println();
		System.out.println("일정이 등록되었습니다! : D");
	}
	//////////////////////////////////////
	/// 일정 삭제 로직
	public int deleteNum(ArrayList<ScheduleVO> datas) {//인자필요 일정객체배열리스트
		int num;
		while(true) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 삭제 일정 입력  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.print("   :::   ");
			try {
				num = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("✖︎ ✖︎  삭제하실 일정을 다시 확인해주세요!  ✖ ︎✖");
				continue;
			}
			if(num<1 || num>datas.size()) {
				System.out.println("✖︎ ✖︎  삭제하실 일정을 다시 확인해주세요!  ✖ ︎✖");
				continue;
			}
			break;
		}
		//실질적인 데이터의 pk값 대입
		int pk=datas.get(num-1).getpNum();
		return pk;
	}

	/////////////////////////////////////////////////////////////////////////////////
	//// 강수량, 기온정보로 이모지 설정로직
	public String getEmoji(int rain, String temp) { // 강수량이랑 기온을 인자로 받음. 기온에 따라 눈과 비를 표시해줌
		String emoji = "";
		if(rain<=0) { 
			emoji= "☀︎";
		}
		else if(rain<=60) {
			emoji="☁";
		}
		else { // 최저기온+숫자+도씨 
			ArrayList<String> alTemp_ = new ArrayList<>(Arrays.asList(temp.split("기온"))); // "기온"을 기준으로 자름: "최저" 0인덱스,"숫자+도씨"가 1번인덱스
			ArrayList<String> alTemp = new ArrayList<>(Arrays.asList(alTemp_.get(1).split("°"))); // 1번인덱스에서 도씨로 자름 => String "숫자"만 남음
			int intTemp = Integer.parseInt(alTemp.get(0)); // String "숫자"를 int로 변환
			if(intTemp > 0) {
				emoji="☂︎";
			}
			else { 
				emoji="☃︎";
			}
		}
		return emoji; 
	}
	/////////////////////////////////////////////////////////////////////
	//////////// 관리자 일정 출력 
	public boolean adminselectAll(ArrayList<ScheduleVO> datas) {
		if(datas.isEmpty()) {
			System.out.println("아직 일정이 없습니다.");
			return false;
		}
		/*전체 출력*/
		for(int i=0;i<datas.size();i++) {

			if(!datas.get(i).getLowTemperature().isEmpty()) {

				if(datas.get(i).getAmRainfall().isEmpty()) {
					datas.get(i).setAmRainfall("0");
				}
				if(datas.get(i).getPmRainfall().isEmpty()) {
					datas.get(i).setPmRainfall("0");
				}

				ArrayList<String> amList = new ArrayList<>(Arrays.asList(datas.get(i).getAmRainfall().split("%")));
				ArrayList<String> pmList = new ArrayList<>(Arrays.asList(datas.get(i).getPmRainfall().split("%")));
				int amRain=Integer.parseInt(amList.get(0));
				int pmRain=Integer.parseInt(pmList.get(0));
				String amEmoji = getEmoji(amRain, datas.get(i).getLowTemperature());
				String pmEmoji = getEmoji(pmRain, datas.get(i).getLowTemperature());


				//i. 월/일 어디어디어디어디 일정 날씨
				System.out.println((i+1)+". [ "+datas.get(i).getID()+"  /  "+datas.get(i).getMonth() +"월"+datas.get(i).getDay()+"일 ] \n     " +datas.get(i).getGu()+" "+datas.get(i).getDong()+"\n     "
						+datas.get(i).getLowTemperature()+" / "+datas.get(i).getHighTemperature()+"  오전:"+amEmoji+ "  오후:"+pmEmoji+"\n     📄 "+datas.get(i).getMemo() + " ⌟ ");
				System.out.println();
			}
			else {
				System.out.println((i+1)+".  [ "+datas.get(i).getID()+"  /  "+datas.get(i).getMonth() +"월"+datas.get(i).getDay()+"일 ]"+" \n      📄"+datas.get(i).getMemo()+" ⌟\n      제공되는 날씨 정보 없음");
				System.out.println();			}         
		}
		return true;
	}
	//////////////////////////////////////////////////////////////////
	/////회원 일정 전체출력
	public boolean selectAll(ArrayList<ScheduleVO> datas) {
		if(datas.isEmpty()) { // 일정이 없을때
			System.out.println("아직 일정이 없습니다.");
			return false;
		}
		/*전체 출력*/
		for(int i=0;i<datas.size();i++) {

			if(!datas.get(i).getLowTemperature().isEmpty()) { // 최저기온이 비어있지않다면(날씨정보가 있다면)

				if(datas.get(i).getAmRainfall().isEmpty()) { // 오전강수량이 비어있다면
					datas.get(i).setAmRainfall("0"); // 0으로 나오게 세팅
				}
				if(datas.get(i).getPmRainfall().isEmpty()) { // 오후강수량이 비어있다면
					datas.get(i).setPmRainfall("0"); // 0으로 나오게 세팅
				}
				// 이모지출력을 위한 코드 - 강수량만                                         (  예를들어 80% -> %기준으로 자른다)
				ArrayList<String> amList = new ArrayList<>(Arrays.asList(datas.get(i).getAmRainfall().split("%"))); // ArryList안에 String80
				// String값인 미니레인풀을 %기준으로 스플릿하여 배열리스트에저장
				ArrayList<String> pmList = new ArrayList<>(Arrays.asList(datas.get(i).getPmRainfall().split("%")));
				
				int amRain=Integer.parseInt(amList.get(0)); // int80 으로 바꿔줌
				int pmRain=Integer.parseInt(pmList.get(0)); 
				
				String amEmoji = getEmoji(amRain, datas.get(i).getLowTemperature()); // (80, 최저기온)인자로 넘겨줌
				String pmEmoji = getEmoji(pmRain, datas.get(i).getLowTemperature()); 


				//i. 월/일 어디어디어디어디 일정 날씨
				System.out.println((i+1)+". [ "+datas.get(i).getMonth() +"월"+datas.get(i).getDay()+"일 ] \n     " +datas.get(i).getGu()+" "+datas.get(i).getDong()+"\n     "
						+datas.get(i).getLowTemperature()+" / "+datas.get(i).getHighTemperature()+"  오전:"+amEmoji+ "  오후:"+pmEmoji+"\n     📄 "+datas.get(i).getMemo() + " ⌟ ");
				System.out.println();
			}
			else {
				System.out.println((i+1)+".  [ "+datas.get(i).getMonth() +"월"+datas.get(i).getDay()+"일 ]"+" \n      📄"+datas.get(i).getMemo()+" ⌟\n      제공되는 날씨 정보 없음");
				System.out.println();
			}         
		}
		return true;
	}

	///////////////////////////////////////////////////////////////////////////////
	//// 변경할 일정 변경 로직
	public ScheduleVO changeDiary(ArrayList<ScheduleVO>datas) { 
		System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
		System.out.println("변경하실 일정번호를 입력해주세요");
		System.out.print("입력 : ");
		int pknum;
		while(true) {
			int len;         
			len=datas.size();
			try {
				pknum = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("번호를 다시한번 확인해주세요.");
				continue;
			}
			if(pknum<1 || pknum>len) {
				System.out.println("번호를 다시한번 확인해주세요.");
				continue;
			}
			break;
		}
		ScheduleVO svo=new ScheduleVO(); 
		//실질적인 데이터의 pk값 대입 
		int pk=datas.get(pknum-1).getpNum();

		int num;
		while(true) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println("1.메모변경 2.날짜변경");
			try {
				num = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("번호를 다시한번 확인해주세요.");
				continue;
			}
			if(num<1 || num>2) {
				System.out.println("번호를 다시한번 확인해주세요.");
				continue;
			}
			break;
		}
		if(num == 1) {
			System.out.println("변경하실 일정메모를 입력해 주세요");
			sc.nextLine();
			String dia=sc.nextLine();
			//객체에 pk번호 세트
			svo.setpNum(pk);
			//객체에 새로운 일정세트
			svo.setMemo(dia);;
		}
		else if(num == 2){
			svo.setYear(year());
			svo.setMonth(mon(svo.getYear()));
			svo.setDay(day(svo.getYear(), svo.getMonth()));
			svo.setDong(datas.get(pknum-1).getDong()); 
			// 일정변경할때 그 일정의 위치를 그대로 가져와서 날씨정보를 다시 검색하기위해서(크롤링하기위해서!)
			svo.setpNum(pk);
		}
		return svo;
	}

//	public boolean deleteDiary() { // 이건 어디있나요
//		System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 삭제 [Y/N]  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
//		System.out.print("   :::   ");
//		String ans=sc.next();
//		if(ans.equalsIgnoreCase("Y")) {
//			return true;
//		}
//		return false;
//	}

	//-----------------------------------------------------------------------------------------------------------
	// 회원 탈퇴 로직
	public boolean getCheck(MemberVO vo) {
		while(true) {
			System.out.println(vo.getName()+"님, 정말 탈퇴하시겠습니까? [Y/N]");
			String ans = sc.next();
			if(ans.equalsIgnoreCase("Y")) {
				return true;
			}
			else if(ans.equalsIgnoreCase("N")) {
				return false;
			}
		}
	}
	//-----------------------------------------------------------------------------------------------------------
	// 회원 변경 로직
	public MemberVO updateMember(MemberVO vo) {
		int num;
		System.out.println();System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 회원 변경 입력  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");

		while(true){
			System.out.println("1.  비밀번호");
			System.out.println("2.  이름");
			System.out.print("   :::   ");
			try {
				num=sc.nextInt();
			} catch (Exception e) {
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("✖︎ ✖︎ 번호를 다시 확인해주세요!  ✖ ︎✖"); 
				System.out.print("   :::   ");           
				continue;
			}
			if(num<1 || num>2) {
				System.out.println("✖︎ ✖︎ 번호를 다시 확인해주세요!  ✖ ︎✖"); 
				System.out.print("   :::   ");          
				continue;
			}
			break;
		}

		if(num==1) {
			System.out.println("새로운 비밀번호를 입력해주세요.");
			String pw=sc.next();
			vo.setPw(pw);
		}
		else {
			System.out.println("새로운 이름을 입력해주세요.");
			String nm=sc.next();
			vo.setName(nm);
		}

		return vo;
	}


	//--------------------------------------------------------------------------------------------
	// 일정변경 성공
	public void scheduleChangeTrue() {
		System.out.println("일정을 변경 완료하였습니다 :D");
	}
	//--------------------------------------------------------------------------------------------
	// 일정변경 실패
	public void scheduleChangeFalse() {
		System.out.println("✖︎ ✖︎ 일정이 변경되지 않았습니다!  ✖ ︎✖");
	}
	//--------------------------------------------------------------------------------------------
	// 회원정보변경 성공
	public void memberChangeTrue() {
		System.out.println("회원 정보가 변경되었습니다.");
	}
	//--------------------------------------------------------------------------------------------
	// 회원정보변경 실패
	public void memberChangeFalse() {
		System.out.println("✖︎ ✖︎ 회원정보가 변경되지 않았습니다!  ✖ ︎✖");
	}
	//--------------------------------------------------------------------------------------------
	// 일정 삭제 성공
	public void scheduleDeleteTrue() {
		System.out.println("일정이 삭제되었습니다.");
	}
	//--------------------------------------------------------------------------------------------
	// 일정 삭제 실패
	public void scheduleDeleteFalse() {
		System.out.println("✖︎ ✖ 일정이 삭제되지않았습니다. ✖︎ ✖");
	}
	//--------------------------------------------------------------------------------------------
	// 회원 탈퇴성공
	public void memberDeleteTrue() {
		System.out.println("회원탈퇴에 성공했습니다.");
		System.out.println("다음에 다시 만나요 :D");
	}

	//----------------------------------------------------------------------------------------
	// 회원탈퇴 실패
	public void memberDeleteFalse() {
		System.out.println("✖︎ ✖ 회원탈퇴에 실패하였습니다. ✖︎ ✖");
	}
	//---------------------------------------------------------------------------------
	// 관리자 메뉴
	public int adminMenu() {  //로그인후 회원 메뉴 출력
		int act;
		while(true) {
			try {
				System.out.println();
				System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯  관리자 메뉴  ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
				System.out.println("1. 일정출력");
				System.out.println("2. 일정삭제");
				System.out.println("3. 로그아웃");
				System.out.print("   :::   ");
				act = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine(); //에러값을 먹어준다
				System.out.println("✖︎ ✖︎  입력 범위로 입력해주세요!  ✖ ︎✖︎");
				continue;
			}
			if(1<=act && act <=3) {
				break;
			}
			System.out.println("✖︎ ✖︎  입력 범위로 입력해주세요!  ✖ ︎✖︎");
		}
		return act;
	}




}