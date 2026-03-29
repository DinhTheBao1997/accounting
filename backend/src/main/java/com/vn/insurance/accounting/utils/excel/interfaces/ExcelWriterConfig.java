package com.vn.insurance.accounting.utils.excel.interfaces;

import java.util.List;

import com.vn.insurance.accounting.utils.grid.model.ColDef;

public interface ExcelWriterConfig {
	public List<ColDef> getColDefs();
	public int getStartColIndex();
	public int getStartRowIndex();
	public Sheet getWorkingSheet();
}
