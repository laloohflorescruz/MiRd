package com.crudcreativo.mird;

/**
 * Created by Eduardo Flores on 7/1/2018.
 */

public class Sur {
    private String mSite;
    private int mImageResourceId;


    public Sur(String vSite, int vFoto)
    {
        mSite= vSite;
        mImageResourceId= vFoto;
    }

    public String getSite(){ return mSite; }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}


