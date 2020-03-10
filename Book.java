public class Book{
	private String title;
	private int pageNum;
	public void setpageNum(int pageNum){
		if(pageNum<=200){
			this.pageNum=200;
		}
		this.pageNum=pageNum;
	}
	public String getTitle(){
           return title;
	}
    public int getpageNum(){
    	return pageNum;

    }
    public String detail(){
    	System.out.println(setTitle());
    	System.out.println(getpageNum());
    }

}