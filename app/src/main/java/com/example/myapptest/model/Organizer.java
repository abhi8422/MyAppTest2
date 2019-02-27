package com.example.myapptest.model;

public class Organizer {
    private String member_id;

    private String name;

    //private Photo photo;

    public String getMember_id ()
    {
        return member_id;
    }

    public void setMember_id (String member_id)
    {
        this.member_id = member_id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    /*public Photo getPhoto ()
    {
        return photo;
    }

    public void setPhoto (Photo photo)
    {
        this.photo = photo;
    }*/

    @Override
    public String toString()
    {
        return "ClassPojo [member_id = "+member_id+", name = "+name+", photo = ";
    }
}
