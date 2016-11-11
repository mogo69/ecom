package com.mogo.ecom.domain.model.order;

import com.mogo.ecom.domain.model.ValueObject;

public class Document implements ValueObject<Document>{
	
	private final String linkToFile;
	private final PageSize pageSize;
	
	
	public Document(String linkToFile, PageSize pageSize, int numberOfPages, int numberOfColorPages) {
		super();
		this.linkToFile = linkToFile;
		this.pageSize = pageSize;
	}

	@Override
	public boolean sameValueAs(Document other) {
		// TODO Auto-generated method stub
		return other != null && linkToFile.equals(other.getLinkToFile());
	}

	public String getLinkToFile() {
		return linkToFile;
	}

	public PageSize getPageSize() {
		return pageSize;
	}

}
