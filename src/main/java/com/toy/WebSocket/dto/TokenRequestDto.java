package com.toy.WebSocket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TokenRequestDto {

  private String accessToken;
  private String refreshToken;
}
