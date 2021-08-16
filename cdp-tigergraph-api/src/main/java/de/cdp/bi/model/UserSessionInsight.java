package de.cdp.bi.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "income",
        "jobStatus",
        "education",
        "gender",
        "sessionId",
        "purchasingPower",
        "sinusMilieus",
        "insightsType",
        "interest",
        "family",
        "user",
        "age",
        "eventReceivedTimestamp"
})
public class UserSessionInsight implements Serializable
{

    @JsonProperty("income")
    private String income;
    @JsonProperty("jobStatus")
    private String jobStatus;
    @JsonProperty("education")
    private String education;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("sessionId")
    private String sessionId;
    @JsonProperty("purchasingPower")
    private String purchasingPower;
    @JsonProperty("sinusMilieus")
    private String sinusMilieus;
    @JsonProperty("insightsType")
    private String insightsType;
    @JsonProperty("interest")
    private String interest;
    @JsonProperty("family")
    private String family;
    @JsonProperty("user")
    private String user;
    @JsonProperty("age")
    private String age;
    @JsonProperty("eventReceivedTimestamp")
    private int eventReceivedTimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1355257890151756636L;

    /**
     * No args constructor for use in serialization
     *
     */
    public UserSessionInsight() {
    }

    public UserSessionInsight(String income, String jobStatus, String education, String gender, String sessionId, String purchasingPower, String sinusMilieus, String insightsType, String interest, String family, String user, String age, int eventReceivedTimestamp) {
        super();
        this.income = income;
        this.jobStatus = jobStatus;
        this.education = education;
        this.gender = gender;
        this.sessionId = sessionId;
        this.purchasingPower = purchasingPower;
        this.sinusMilieus = sinusMilieus;
        this.insightsType = insightsType;
        this.interest = interest;
        this.family = family;
        this.user = user;
        this.age = age;
        this.eventReceivedTimestamp = eventReceivedTimestamp;
    }

    @JsonProperty("income")
    public String getIncome() {
        return income;
    }

    @JsonProperty("income")
    public void setIncome(String income) {
        this.income = income;
    }

    public UserSessionInsight withIncome(String income) {
        this.income = income;
        return this;
    }

    @JsonProperty("jobStatus")
    public String getJobStatus() {
        return jobStatus;
    }

    @JsonProperty("jobStatus")
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public UserSessionInsight withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    @JsonProperty("education")
    public String getEducation() {
        return education;
    }

    @JsonProperty("education")
    public void setEducation(String education) {
        this.education = education;
    }

    public UserSessionInsight withEducation(String education) {
        this.education = education;
        return this;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserSessionInsight withGender(String gender) {
        this.gender = gender;
        return this;
    }

    @JsonProperty("sessionId")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public UserSessionInsight withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    @JsonProperty("purchasingPower")
    public String getPurchasingPower() {
        return purchasingPower;
    }

    @JsonProperty("purchasingPower")
    public void setPurchasingPower(String purchasingPower) {
        this.purchasingPower = purchasingPower;
    }

    public UserSessionInsight withPurchasingPower(String purchasingPower) {
        this.purchasingPower = purchasingPower;
        return this;
    }

    @JsonProperty("sinusMilieus")
    public String getSinusMilieus() {
        return sinusMilieus;
    }

    @JsonProperty("sinusMilieus")
    public void setSinusMilieus(String sinusMilieus) {
        this.sinusMilieus = sinusMilieus;
    }

    public UserSessionInsight withSinusMilieus(String sinusMilieus) {
        this.sinusMilieus = sinusMilieus;
        return this;
    }

    @JsonProperty("insightsType")
    public String getInsightsType() {
        return insightsType;
    }

    @JsonProperty("insightsType")
    public void setInsightsType(String insightsType) {
        this.insightsType = insightsType;
    }

    public UserSessionInsight withInsightsType(String insightsType) {
        this.insightsType = insightsType;
        return this;
    }

    @JsonProperty("interest")
    public String getInterest() {
        return interest;
    }

    @JsonProperty("interest")
    public void setInterest(String interest) {
        this.interest = interest;
    }

    public UserSessionInsight withInterest(String interest) {
        this.interest = interest;
        return this;
    }

    @JsonProperty("family")
    public String getFamily() {
        return family;
    }

    @JsonProperty("family")
    public void setFamily(String family) {
        this.family = family;
    }

    public UserSessionInsight withFamily(String family) {
        this.family = family;
        return this;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public UserSessionInsight withUser(String user) {
        this.user = user;
        return this;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    public UserSessionInsight withAge(String age) {
        this.age = age;
        return this;
    }

    @JsonProperty("eventReceivedTimestamp")
    public int getEventReceivedTimestamp() {
        return eventReceivedTimestamp;
    }

    @JsonProperty("eventReceivedTimestamp")
    public void setEventReceivedTimestamp(int eventReceivedTimestamp) {
        this.eventReceivedTimestamp = eventReceivedTimestamp;
    }

    public UserSessionInsight withEventReceivedTimestamp(int eventReceivedTimestamp) {
        this.eventReceivedTimestamp = eventReceivedTimestamp;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public UserSessionInsight withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserSessionInsight.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("income");
        sb.append('=');
        sb.append(((this.income == null)?"<null>":this.income));
        sb.append(',');
        sb.append("jobStatus");
        sb.append('=');
        sb.append(((this.jobStatus == null)?"<null>":this.jobStatus));
        sb.append(',');
        sb.append("education");
        sb.append('=');
        sb.append(((this.education == null)?"<null>":this.education));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("sessionId");
        sb.append('=');
        sb.append(((this.sessionId == null)?"<null>":this.sessionId));
        sb.append(',');
        sb.append("purchasingPower");
        sb.append('=');
        sb.append(((this.purchasingPower == null)?"<null>":this.purchasingPower));
        sb.append(',');
        sb.append("sinusMilieus");
        sb.append('=');
        sb.append(((this.sinusMilieus == null)?"<null>":this.sinusMilieus));
        sb.append(',');
        sb.append("insightsType");
        sb.append('=');
        sb.append(((this.insightsType == null)?"<null>":this.insightsType));
        sb.append(',');
        sb.append("interest");
        sb.append('=');
        sb.append(((this.interest == null)?"<null>":this.interest));
        sb.append(',');
        sb.append("family");
        sb.append('=');
        sb.append(((this.family == null)?"<null>":this.family));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("age");
        sb.append('=');
        sb.append(((this.age == null)?"<null>":this.age));
        sb.append(',');
        sb.append("eventReceivedTimestamp");
        sb.append('=');
        sb.append(this.eventReceivedTimestamp);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserSessionInsight) == false) {
            return false;
        }
        UserSessionInsight rhs = ((UserSessionInsight) other);
        return (((((((((((((((this.income == rhs.income)||((this.income!= null)&&this.income.equals(rhs.income)))&&((this.jobStatus == rhs.jobStatus)||((this.jobStatus!= null)&&this.jobStatus.equals(rhs.jobStatus))))&&((this.education == rhs.education)||((this.education!= null)&&this.education.equals(rhs.education))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.sessionId == rhs.sessionId)||((this.sessionId!= null)&&this.sessionId.equals(rhs.sessionId))))&&((this.purchasingPower == rhs.purchasingPower)||((this.purchasingPower!= null)&&this.purchasingPower.equals(rhs.purchasingPower))))&&((this.sinusMilieus == rhs.sinusMilieus)||((this.sinusMilieus!= null)&&this.sinusMilieus.equals(rhs.sinusMilieus))))&&((this.insightsType == rhs.insightsType)||((this.insightsType!= null)&&this.insightsType.equals(rhs.insightsType))))&&((this.interest == rhs.interest)||((this.interest!= null)&&this.interest.equals(rhs.interest))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.family == rhs.family)||((this.family!= null)&&this.family.equals(rhs.family))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.age == rhs.age)||((this.age!= null)&&this.age.equals(rhs.age))))&&(this.eventReceivedTimestamp == rhs.eventReceivedTimestamp));
    }

}