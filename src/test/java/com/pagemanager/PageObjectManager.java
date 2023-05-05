package com.pagemanager;

import com.pages.LoginPage;
import com.pages.SearchHotelPage;

import com.pages.SelectHotelPage;

public class PageObjectManager {
	private  LoginPage loginPage;
	private  SearchHotelPage searchHotelPage;

	private  SelectHotelPage selectHotelPage;

	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	public SearchHotelPage getSearchHotel() {
		return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
	}

	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
	}


}
