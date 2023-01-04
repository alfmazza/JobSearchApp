package com.alpi.jobsearch;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JobPosition {

    @SerializedName("title")
    private String jobTitle;

    @SerializedName("company_name")
    private String companyName;

    private String location;

    private String via;

    private String description;

    private String thumbnail;

    private List<String> extensions;

    @SerializedName("detected_extensions")
    private Map<String, String> detectedExtensions;

    @SerializedName("job_id")
    private String jobId;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<String> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<String> extensions) {
        this.extensions = extensions;
    }

    public Map<String, String> getDetectedExtensions() {
        return detectedExtensions;
    }

    public void setDetectedExtensions(Map<String, String> detectedExtensions) {
        this.detectedExtensions = detectedExtensions;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equals(jobTitle, that.jobTitle) && Objects.equals(companyName, that.companyName) && Objects.equals(location, that.location) && Objects.equals(via, that.via) && Objects.equals(description, that.description) && Objects.equals(thumbnail, that.thumbnail) && Objects.equals(extensions, that.extensions) && Objects.equals(detectedExtensions, that.detectedExtensions) && Objects.equals(jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobTitle, companyName, location, via, description, thumbnail, extensions, detectedExtensions, jobId);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "title='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", via='" + via + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", extensions=" + extensions +
                ", detectedExtensions=" + detectedExtensions +
                ", jobId='" + jobId + '\'' +
                '}';
    }
}
