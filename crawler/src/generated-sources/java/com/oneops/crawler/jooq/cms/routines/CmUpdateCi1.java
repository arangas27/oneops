/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmUpdateCi1 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -53733993;

    /**
     * The parameter <code>kloopzcm.cm_update_ci.p_ci_id</code>.
     */
    public static final Parameter<Long> P_CI_ID = createParameter("p_ci_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_ci.p_ci_name</code>.
     */
    public static final Parameter<String> P_CI_NAME = createParameter("p_ci_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_ci.p_comments</code>.
     */
    public static final Parameter<String> P_COMMENTS = createParameter("p_comments", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_ci.p_state_id</code>.
     */
    public static final Parameter<Integer> P_STATE_ID = createParameter("p_state_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_ci.p_updated_by</code>.
     */
    public static final Parameter<String> P_UPDATED_BY = createParameter("p_updated_by", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public CmUpdateCi1() {
        super("cm_update_ci", Kloopzcm.KLOOPZCM);

        addInParameter(P_CI_ID);
        addInParameter(P_CI_NAME);
        addInParameter(P_COMMENTS);
        addInParameter(P_STATE_ID);
        addInParameter(P_UPDATED_BY);
        setOverloaded(true);
    }

    /**
     * Set the <code>p_ci_id</code> parameter IN value to the routine
     */
    public void setPCiId(Long value) {
        setValue(P_CI_ID, value);
    }

    /**
     * Set the <code>p_ci_name</code> parameter IN value to the routine
     */
    public void setPCiName(String value) {
        setValue(P_CI_NAME, value);
    }

    /**
     * Set the <code>p_comments</code> parameter IN value to the routine
     */
    public void setPComments(String value) {
        setValue(P_COMMENTS, value);
    }

    /**
     * Set the <code>p_state_id</code> parameter IN value to the routine
     */
    public void setPStateId(Integer value) {
        setValue(P_STATE_ID, value);
    }

    /**
     * Set the <code>p_updated_by</code> parameter IN value to the routine
     */
    public void setPUpdatedBy(String value) {
        setValue(P_UPDATED_BY, value);
    }
}
