package com.jbtits.github2telegram.domain.dto.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class FellowResponse extends FellowRequest {
	private long id;
}
