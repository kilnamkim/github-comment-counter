package com.tzachz.commentcounter.apifacade.jsonobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: tzachz
 * Date: 8/8/13
 * A very partial representation of a GitHub Pull Request Comment
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GHComment {

    private final GHUser user;
    private final String pullRequestUrl;
    private final String body;
    private final String htmlUrl;
    private final Date createDate;

    @JsonCreator
    public GHComment(@JsonProperty("user") GHUser user,
                     @JsonProperty("pull_request_url") String pullRequestUrl,
                     @JsonProperty("body") String body,
                     @JsonProperty("html_url") String htmlUrl,
                     @JsonProperty("created_at") Date createDate) {
        this.body = body;
        this.user = user;
        this.pullRequestUrl = pullRequestUrl;
        this.htmlUrl = htmlUrl;
        this.createDate = createDate;
    }

    public GHUser getUser() {
        return user;
    }

    public String getPullRequestUrl() {
        return pullRequestUrl;
    }

    public String getBody() {
        return body;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public Date getCreateDate() {
        return createDate;
    }
}
