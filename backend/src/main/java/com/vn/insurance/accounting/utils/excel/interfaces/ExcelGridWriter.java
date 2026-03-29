package com.vn.insurance.accounting.utils.excel.interfaces;

import java.util.List;
import java.util.Map;

public interface ExcelGridWriter {
	public int initGrid(List<Map<String, Object>> dataList);
}
