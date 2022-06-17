package com.jojoldu.book.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

    @Test
    public void test_lombok() {
        String name= "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);

        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
