package Assignment3;

public class Author {
		private int authid;
		private String authName;
		private String authaddress;
		public Author(int authid, String authName, String authaddress)
		{
			super();
			this.authid = authid;
			this.authName = authName;
			this.authaddress = authaddress;
		}
		public int getAuthid() {
			return authid;
		}
		public void setAuthid(int authid) {
			this.authid = authid;
		}
		public String getAuthName() {
			return authName;
		}
		public void setAuthName(String authName) {
			this.authName = authName;
		}
		public String getAuthaddress() {
			return authaddress;
		}
		public void setAuthaddress(String authaddress) {
			this.authaddress = authaddress;
		}
		@Override
		public String toString() {
			return "Author [authid=" + authid + ", authName=" + authName + ", authaddress=" + authaddress + "\n]";
		}
		
		
		
}
