package com.crudcreativo.mird;

/**
 * Created by Eduardo Flores on 7/1/2018.
 */

public class Cibao {

    private String mSite;
    private int mImageResourceId;


    public Cibao(String vSite, int vFoto)
    {
        mSite= vSite;
        mImageResourceId= vFoto;

    }

    public String getSite(){ return mSite; }
    public int getmImageResourceId(){ return mImageResourceId; }

}


