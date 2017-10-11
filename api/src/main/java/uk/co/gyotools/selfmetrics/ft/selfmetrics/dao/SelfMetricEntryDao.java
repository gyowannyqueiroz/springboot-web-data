package uk.co.gyotools.selfmetrics.ft.selfmetrics.dao;

import uk.co.gyotools.selfmetrics.ft.selfmetrics.model.SelfMetricEntry;

import java.util.Date;
import java.util.List;

public interface SelfMetricEntryDao extends CrudDao<SelfMetricEntry, String>{

    List<SelfMetricEntry> findByNameAndTimestampBetween(String name, Date from, Date to);

}
