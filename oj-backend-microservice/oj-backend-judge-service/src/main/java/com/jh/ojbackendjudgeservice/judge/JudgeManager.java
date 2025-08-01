package com.jh.ojbackendjudgeservice.judge;


import com.jh.ojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.jh.ojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.jh.ojbackendjudgeservice.judge.strategy.JudgeContext;
import com.jh.ojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.jh.ojbackendmodel.model.codesandbox.JudgeInfo;
import com.jh.ojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager
{

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext)
    {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language))
        {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}