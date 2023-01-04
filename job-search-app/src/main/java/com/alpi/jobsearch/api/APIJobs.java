package com.alpi.jobsearch.api;

import com.alpi.jobsearch.JobPosition;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;


@Headers("Accept: application/json")
public interface APIJobs {

    @RequestLine("GET /search?engine=google_jobs")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryMap);
}
