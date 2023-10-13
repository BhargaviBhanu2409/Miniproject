package projectSmartCity;

import java.util.Date;

public class News {

	private String headline;
	 private String content;
	 private Date date;
	 public News() 
	   {
	    	super();
	     }
	 
	 public News(String headline,  String content, Date date) 
	 {
		 super();
		 this.headline = headline;
	     this.content = content;
	     this.date = date; 
	 }
		 public String getHeadline() {
			return headline;
		}

		public void setHeadline(String headline) {
			this.headline = headline;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
		@Override
		public String toString() {
			return "News [headline=" + headline + ", content=" + content + ", date=" + date + "]";
		}
}
