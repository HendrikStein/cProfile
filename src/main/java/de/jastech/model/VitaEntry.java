package de.jastech.model;

import de.jastech.utils.DateUtils;

import java.util.Date;

import lombok.Data;

/**
 * VitaEntry model.
 * 
 * @author Hendrik Stein
 */
@Data
public class VitaEntry {
  private String station;
  private Date start;
  private Date end;

  /**
   * Convert {@link VitaEntry} to String.
   */
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(DateUtils.format(start)).append(" - ").append(DateUtils.format(end)).append("\r")
        .append(station);
    return builder.toString();
  }

  /**
   * Get end date.
   * 
   * @return {@link Date}
   */
  public Date getEnd() {
    if (end == null) {
      return new Date();
    }
    return end;
  }

}
