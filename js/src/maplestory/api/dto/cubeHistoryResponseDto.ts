import {CubeHistoryDto} from "./cubeHistoryDto";
import {CubeHistoryResponseDtoBody} from "../response/cubeHistoryResponseDtoBody";

/**
 * 큐브히스토리 응답 정보
 */
class CubeHistoryResponseDto {

	/**
	 * 결과 건 수
	 */
	count: number;

	/**
	 * 큐브 히스토리
	 */
	cubeHistories: CubeHistoryDto[];

	/**
	 * 페이징 처리를 위한 cursor
	 */
	nextCursor: string;

	constructor(obj: CubeHistoryResponseDtoBody) {
		const {count, cube_histories, next_cursor} = obj;

		this.count = count;
		this.cubeHistories = cube_histories.map(origin => new CubeHistoryDto(origin));
		this.nextCursor = next_cursor;
	}
}

export {CubeHistoryResponseDto};