package com.vn.insurance.accounting.utils.grid.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ColDef {
	private String title;
	private String field;
	private String type;
	private List<ColDef> childrens;
	private String excelCol;
	private Boolean isHide;
}
