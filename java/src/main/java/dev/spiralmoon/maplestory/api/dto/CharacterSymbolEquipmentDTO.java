package dev.spiralmoon.maplestory.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 캐릭터 심볼 정보
 */
@AllArgsConstructor
@Data
@ToString
public class CharacterSymbolEquipmentDTO {

    /**
     * 조회 기준일 (KST, 일 단위 데이터로 시, 분은 일괄 0으로 표기)
     */
    @SerializedName("date")
    private String date;

    /**
     * 캐릭터 직업
     */
    @SerializedName("character_class")
    private String characterClass;

    /**
     * 심볼 정보 목록
     */
    @SerializedName("symbol")
    private List<CharacterSymbolEquipmentInfoDTO> symbol;
}
