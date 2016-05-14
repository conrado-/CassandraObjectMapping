package cassandra;

import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "dev_global_test", name = "g_users")
public class UserVo {
	@PartitionKey(0)
	public int organizationId;
	@PartitionKey(1)
	public long userId;
	private int passwordPolicyId = 0;
	private boolean pswrdChngRqrdFl = true;
	private boolean lockedFl = true;
	private int languageId = 1;
	private String status = "0";
	private String type = "0";
	private java.util.Date creationTs = null;
	private java.util.Date logonTs;
	private java.util.Date modifiedTs = null;
	private java.util.Date pswrdCreationTs = null;
	private java.util.Date pswrdInvalidTs;
	private String clientIp;
	private String email;
	private String firstName;
	private String lastName;
	private String logon;
	private String password;
	private String phone;
	private String server;
	private String sessionId;
	private String clusterId;
	private String port;
	private int lastUsedDataAcct;
	private int pswrdFailures;
	private String appType;
	private String appVersion;
	private long locationId;
	private String terminalCd;
	private boolean allowAccToPrvDtFl = false;
	private boolean crmAdminFl = false;
	private boolean allowAccToCrmFl = false;
	private boolean allowAccToTkFl = false;
	private boolean allowAccToTkRFl = false;
	private boolean allowAccToDonFl = false;
	private boolean allowAccToDonRFl = false;
	private long supervisorUserId;
	private String emailClientUId;
	private long createUserId = -1;
	private java.util.Date createTs;
	private long lastUpdateUserId = -1;
	private java.util.Date lastUpdateTs;

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getPasswordPolicyId() {
		return passwordPolicyId;
	}

	public void setPasswordPolicyId(int passwordPolicyId) {
		this.passwordPolicyId = passwordPolicyId;
	}

	public boolean isPswrdChngRqrdFl() {
		return pswrdChngRqrdFl;
	}

	public boolean getPswrdChngRqrdFl() {
		return pswrdChngRqrdFl;
	}

	public void setPswrdChngRqrdFl(boolean pswrdChngRqrdFl) {
		this.pswrdChngRqrdFl = pswrdChngRqrdFl;
	}

	public boolean isLockedFl() {
		return lockedFl;
	}

	public boolean getLockedFl() {
		return lockedFl;
	}

	public void setLockedFl(boolean lockedFl) {
		this.lockedFl = lockedFl;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public java.util.Date getCreationTs() {
		return creationTs;
	}

	public void setCreationTs(java.util.Date creationTs) {
		this.creationTs = creationTs;
	}

	public java.util.Date getLogonTs() {
		return logonTs;
	}

	public void setLogonTs(java.util.Date logonTs) {
		this.logonTs = logonTs;
	}

	public java.util.Date getModifiedTs() {
		return modifiedTs;
	}

	public void setModifiedTs(java.util.Date modifiedTs) {
		this.modifiedTs = modifiedTs;
	}

	public java.util.Date getPswrdCreationTs() {
		return pswrdCreationTs;
	}

	public void setPswrdCreationTs(java.util.Date pswrdCreationTs) {
		this.pswrdCreationTs = pswrdCreationTs;
	}

	public java.util.Date getPswrdInvalidTs() {
		return pswrdInvalidTs;
	}

	public void setPswrdInvalidTs(java.util.Date pswrdInvalidTs) {
		this.pswrdInvalidTs = pswrdInvalidTs;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogon() {
		return logon;
	}

	public void setLogon(String logon) {
		this.logon = logon;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public int getLastUsedDataAcct() {
		return lastUsedDataAcct;
	}

	public void setLastUsedDataAcct(int lastUsedDataAcct) {
		this.lastUsedDataAcct = lastUsedDataAcct;
	}

	public int getPswrdFailures() {
		return pswrdFailures;
	}

	public void setPswrdFailures(int pswrdFailures) {
		this.pswrdFailures = pswrdFailures;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public String getTerminalCd() {
		return terminalCd;
	}

	public void setTerminalCd(String terminalCd) {
		this.terminalCd = terminalCd;
	}

	public boolean isAllowAccToPrvDtFl() {
		return allowAccToPrvDtFl;
	}

	public boolean getAllowAccToPrvDtFl() {
		return allowAccToPrvDtFl;
	}

	public void setAllowAccToPrvDtFl(boolean allowAccToPrvDtFl) {
		this.allowAccToPrvDtFl = allowAccToPrvDtFl;
	}

	public boolean isCrmAdminFl() {
		return crmAdminFl;
	}

	public boolean getCrmAdminFl() {
		return crmAdminFl;
	}

	public void setCrmAdminFl(boolean crmAdminFl) {
		this.crmAdminFl = crmAdminFl;
	}

	public boolean isAllowAccToCrmFl() {
		return allowAccToCrmFl;
	}

	public boolean getAllowAccToCrmFl() {
		return allowAccToCrmFl;
	}

	public void setAllowAccToCrmFl(boolean allowAccToCrmFl) {
		this.allowAccToCrmFl = allowAccToCrmFl;
	}

	public boolean isAllowAccToTkFl() {
		return allowAccToTkFl;
	}

	public boolean getAllowAccToTkFl() {
		return allowAccToTkFl;
	}

	public void setAllowAccToTkFl(boolean allowAccToTkFl) {
		this.allowAccToTkFl = allowAccToTkFl;
	}

	public boolean isAllowAccToTkRFl() {
		return allowAccToTkRFl;
	}

	public boolean getAllowAccToTkRFl() {
		return allowAccToTkRFl;
	}

	public void setAllowAccToTkRFl(boolean allowAccToTkRFl) {
		this.allowAccToTkRFl = allowAccToTkRFl;
	}

	public boolean isAllowAccToDonFl() {
		return allowAccToDonFl;
	}

	public boolean getAllowAccToDonFl() {
		return allowAccToDonFl;
	}

	public void setAllowAccToDonFl(boolean allowAccToDonFl) {
		this.allowAccToDonFl = allowAccToDonFl;
	}

	public boolean isAllowAccToDonRFl() {
		return allowAccToDonRFl;
	}

	public boolean getAllowAccToDonRFl() {
		return allowAccToDonRFl;
	}

	public void setAllowAccToDonRFl(boolean allowAccToDonRFl) {
		this.allowAccToDonRFl = allowAccToDonRFl;
	}

	public long getSupervisorUserId() {
		return supervisorUserId;
	}

	public void setSupervisorUserId(long supervisorUserId) {
		this.supervisorUserId = supervisorUserId;
	}

	public String getEmailClientUId() {
		return emailClientUId;
	}

	public void setEmailClientUId(String emailClientUId) {
		this.emailClientUId = emailClientUId;
	}

	public long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}

	public java.util.Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(java.util.Date createTs) {
		this.createTs = createTs;
	}

	public long getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public java.util.Date getLastUpdateTs() {
		return lastUpdateTs;
	}

	public void setLastUpdateTs(java.util.Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer(512);
		strBuff.append(super.toString());
		strBuff.append(" passwordPolicyId=" + passwordPolicyId);
		strBuff.append(" pswrdChngRqrdFl=" + pswrdChngRqrdFl);
		strBuff.append(" lockedFl=" + lockedFl);
		strBuff.append(" languageId=" + languageId);
		strBuff.append(" status=" + status);
		strBuff.append(" type=" + type);
		strBuff.append(" creationTs=" + creationTs);
		strBuff.append(" logonTs=" + logonTs);
		strBuff.append(" modifiedTs=" + modifiedTs);
		strBuff.append(" pswrdCreationTs=" + pswrdCreationTs);
		strBuff.append(" pswrdInvalidTs=" + pswrdInvalidTs);
		strBuff.append(" clientIp=" + clientIp);
		strBuff.append(" email=" + email);
		strBuff.append(" firstName=" + firstName);
		strBuff.append(" lastName=" + lastName);
		strBuff.append(" logon=" + logon);
		strBuff.append(" phone=" + phone);
		strBuff.append(" server=" + server);
		strBuff.append(" sessionId=" + sessionId);
		strBuff.append(" clusterId=" + clusterId);
		strBuff.append(" port=" + port);
		strBuff.append(" lastUsedDataAcct=" + lastUsedDataAcct);
		strBuff.append(" pswrdFailures=" + pswrdFailures);
		strBuff.append(" appType=" + appType);
		strBuff.append(" appVersion=" + appVersion);
		strBuff.append(" locationId=" + locationId);
		strBuff.append(" terminalCd=" + terminalCd);
		strBuff.append(" allowAccToPrvDtFl=" + allowAccToPrvDtFl);
		strBuff.append(" crmAdminFl=" + crmAdminFl);
		strBuff.append(" allowAccToCrmFl=" + allowAccToCrmFl);
		strBuff.append(" allowAccToTkFl=" + allowAccToTkFl);
		strBuff.append(" allowAccToTkRFl=" + allowAccToTkRFl);
		strBuff.append(" allowAccToDonFl=" + allowAccToDonFl);
		strBuff.append(" allowAccToDonRFl=" + allowAccToDonRFl);
		strBuff.append(" supervisorUserId=" + supervisorUserId);
		strBuff.append(" emailClientUId=" + emailClientUId);
		strBuff.append(" createUserId=" + createUserId);
		strBuff.append(" createTs=" + createTs);
		strBuff.append(" lastUpdateUserId=" + lastUpdateUserId);
		strBuff.append(" lastUpdateTs=" + lastUpdateTs);
		return strBuff.toString();
	}
}