package com.yellow.bot.model;

public class DialogFlowQuery {

    private String lang ="en";
    private String query;
    private String sessionId = "123456";

    public DialogFlowQuery(String query) {
        this.query = query;
    }

    public String getLang() {
        return lang;
    }

    public String getQuery() {
        return query;
    }

    public String getSessionId() {
        return sessionId;
    }

    @Override
    public String toString() {
        return "DialogFlowQuery{" +
                "lang='" + lang + '\'' +
                ", query='" + query + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
}
