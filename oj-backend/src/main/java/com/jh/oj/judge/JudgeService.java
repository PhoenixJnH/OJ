package com.jh.oj.judge;

import com.jh.oj.model.entity.QuestionSubmit;

/**
 * 判题服务
 */
public interface JudgeService
{

    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}