package com.cubecode.provider.data.criterial;


import lombok.Data;

import java.util.List;

@Data
public class CriterialModel<T> {
    private CriterialFilter filter;
    private CriterialPaginator paginator;
    private CriterialSort sort;
    private  CriterialMetaData<T> metaData;
    private List<T> result;


}
