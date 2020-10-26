package com.config;


public class GeneratorConfig
{
    //输出的目录
    public String outputDir;
    public String author;
    public String jdbcUrl;
    public String userName;
    public String passWord;
    public String parentPackage;
    //去除表前缀
    public String tablePrefix;

    public void setOutputDir(String outputDir)
    {
        this.outputDir = outputDir;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setJdbcUrl(String jdbcUrl)
    {
        this.jdbcUrl = jdbcUrl;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setPassWord(String passWord)
    {
        this.passWord = passWord;
    }

    public void setParentPackage(String parentPackage)
    {
        this.parentPackage = parentPackage;
    }

    public void setTablePrefix(String tablePrefix)
    {
        this.tablePrefix = tablePrefix;
    }

    public GeneratorConfig(String outputDir, String author, String jdbcUrl, String userName, String passWord, String parentPackage, String tablePrefix)
    {
        this.outputDir = outputDir;
        this.author = author;
        this.jdbcUrl = jdbcUrl;
        this.userName = userName;
        this.passWord = passWord;
        this.parentPackage = parentPackage;
        this.tablePrefix = tablePrefix;
    }

    public GeneratorConfig()
    {
    }
}
