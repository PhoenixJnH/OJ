package com.jh.ojbackendjudgeservice.judge.codesandbox;


import com.jh.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.jh.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox
{
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
