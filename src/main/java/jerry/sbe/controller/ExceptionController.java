package jerry.sbe.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import jerry.sbe.ResponseData;
import jerry.sbe.ResponseDataCode;

@ControllerAdvice
public class ExceptionController {
    private Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    /**
     * 系统异常处理，比如：404,500
     * @param req
     * @param resp
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler()
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error("", e);
        ResponseData r = new ResponseData();
        r.setMessage(e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
             r.setCode(ResponseDataCode.NOT_FOUND);
        } else {
             r.setCode(ResponseDataCode.SC_INTERNAL_SERVER_ERROR);
        }
        r.setData(null);
        r.setStatus(false);
        return r;
    }
}
