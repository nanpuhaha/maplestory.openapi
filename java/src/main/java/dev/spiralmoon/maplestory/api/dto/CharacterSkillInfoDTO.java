package dev.spiralmoon.maplestory.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 캐릭터 스킬 상세 정보
 */
@AllArgsConstructor
@Data
@ToString
public class CharacterSkillInfoDTO {

    /**
     * 스킬 명
     */
    @SerializedName("skill_name")
    private String skillName;

    /**
     * 스킬 설명
     */
    @SerializedName("skill_description")
    private String skillDescription;

    /**
     * 스킬 레벨
     */
    @SerializedName("skill_level")
    private Long skillLevel;

    /**
     * 스킬 레벨 별 효과 설명
     */
    @SerializedName("skill_effect")
    private String skillEffect;

    /**
     * 스킬 아이콘
     */
    @SerializedName("skill_icon")
    private String skillIcon;
}
