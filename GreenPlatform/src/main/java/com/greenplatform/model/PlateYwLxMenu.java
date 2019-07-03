package com.greenplatform.model;

import java.io.Serializable;

public class PlateYwLxMenu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_yw_lx_menu.C_MENUDM
     *
     * @mbggenerated
     */
    private String cMenudm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_yw_lx_menu.C_MENUMC
     *
     * @mbggenerated
     */
    private String cMenumc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_yw_lx_menu.C_MENUJC
     *
     * @mbggenerated
     */
    private String cMenujc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_yw_lx_menu.C_RUNCOMMAND
     *
     * @mbggenerated
     */
    private String cRuncommand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_yw_lx_menu.C_MENUDM
     *
     * @return the value of plate_yw_lx_menu.C_MENUDM
     *
     * @mbggenerated
     */
    public String getcMenudm() {
        return cMenudm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_yw_lx_menu.C_MENUDM
     *
     * @param cMenudm the value for plate_yw_lx_menu.C_MENUDM
     *
     * @mbggenerated
     */
    public void setcMenudm(String cMenudm) {
        this.cMenudm = cMenudm == null ? null : cMenudm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_yw_lx_menu.C_MENUMC
     *
     * @return the value of plate_yw_lx_menu.C_MENUMC
     *
     * @mbggenerated
     */
    public String getcMenumc() {
        return cMenumc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_yw_lx_menu.C_MENUMC
     *
     * @param cMenumc the value for plate_yw_lx_menu.C_MENUMC
     *
     * @mbggenerated
     */
    public void setcMenumc(String cMenumc) {
        this.cMenumc = cMenumc == null ? null : cMenumc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_yw_lx_menu.C_MENUJC
     *
     * @return the value of plate_yw_lx_menu.C_MENUJC
     *
     * @mbggenerated
     */
    public String getcMenujc() {
        return cMenujc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_yw_lx_menu.C_MENUJC
     *
     * @param cMenujc the value for plate_yw_lx_menu.C_MENUJC
     *
     * @mbggenerated
     */
    public void setcMenujc(String cMenujc) {
        this.cMenujc = cMenujc == null ? null : cMenujc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_yw_lx_menu.C_RUNCOMMAND
     *
     * @return the value of plate_yw_lx_menu.C_RUNCOMMAND
     *
     * @mbggenerated
     */
    public String getcRuncommand() {
        return cRuncommand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_yw_lx_menu.C_RUNCOMMAND
     *
     * @param cRuncommand the value for plate_yw_lx_menu.C_RUNCOMMAND
     *
     * @mbggenerated
     */
    public void setcRuncommand(String cRuncommand) {
        this.cRuncommand = cRuncommand == null ? null : cRuncommand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_yw_lx_menu
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cMenudm=").append(cMenudm);
        sb.append(", cMenumc=").append(cMenumc);
        sb.append(", cMenujc=").append(cMenujc);
        sb.append(", cRuncommand=").append(cRuncommand);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}