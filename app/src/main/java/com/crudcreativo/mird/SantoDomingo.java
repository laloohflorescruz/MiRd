package com.crudcreativo.mird;

/**
 * Created by Eduardo Flores on 2/1/2018.
 */

public class SantoDomingo {

    private String mSite;
    private int mImageResourceId;


    public SantoDomingo(String vSite, int vFoto)
    {
        mSite= vSite;
        mImageResourceId= vFoto;
    }

    public String getSite(){ return mSite; }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}


