
public class Execute {

	public static void main(String[] args) {
		String path = "C:\\EclipseWorkspaceAug26\\NavKeywordDriven\\src\\MyDataEngine.xlsx";
		ReadExcelFile.setexcel(path, 0);
        for(int i=0;i<= 3; i++) {
        	String keyword = ReadExcelFile.getData(i, 2);
        	if(keyword.equals("openbrowser")) {
        		ActionKeywords.openbrowser();
        	}
        	else if(keyword.equals("navigate")) {
        		ActionKeywords.navigate();
        	}
        	else if(keyword.equals("click_link")) {
        		ActionKeywords.click_link();
        	}
        }
	}

}
