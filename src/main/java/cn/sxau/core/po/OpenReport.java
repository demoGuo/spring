package cn.sxau.core.po;

import java.util.Date;

public class OpenReport {
    private Long rId;

    private Long fId;

    private String sId;
    
    private String sName;

    private String agree;

	private String tId;
    
    private Long cId;
    
    private String fName;
    
    private String fPath;
    
    private Date uploadDatetime;
    
    private String fType;
    
    private String tName;
    
    private String seltitlState;
    
    private String titlName;
    
    private String major;
    
    private Short batch;
    
    public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

    public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfPath() {
		return fPath;
	}

	public void setfPath(String fPath) {
		this.fPath = fPath;
	}

	public Date getUploadDatetime() {
		return uploadDatetime;
	}

	public void setUploadDatetime(Date uploadDatetime) {
		this.uploadDatetime = uploadDatetime;
	}

	public String getfType() {
		return fType;
	}

	public void setfType(String fType) {
		this.fType = fType;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getSeltitlState() {
		return seltitlState;
	}

	public void setSeltitlState(String seltitlState) {
		this.seltitlState = seltitlState;
	}

	public String getTitlName() {
		return titlName;
	}

	public void setTitlName(String titlName) {
		this.titlName = titlName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Short getBatch() {
		return batch;
	}

	public void setBatch(Short batch) {
		this.batch = batch;
	}

	public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree == null ? null : agree.trim();
    }
}