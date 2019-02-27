package com.example.myapptest.model;

public class Topics {
    private String urlkey;

    private String name;

    private String id;

    public String getUrlkey ()
    {
        return urlkey;
    }

    public void setUrlkey (String urlkey)
    {
        this.urlkey = urlkey;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [urlkey = "+urlkey+", name = "+name+", id = "+id+"]";
    }
}
