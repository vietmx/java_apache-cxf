package com.maixuanviet.cxf.introduction;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(StudentAdapter.class)
public interface Student {
    public String getName();
}