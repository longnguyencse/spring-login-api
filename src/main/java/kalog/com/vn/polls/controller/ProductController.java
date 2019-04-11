package kalog.com.vn.polls.controller;

import kalog.com.vn.polls.dto.PageWrapDto;
import kalog.com.vn.polls.dto.WrapDataDto;
import kalog.com.vn.polls.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    MessageSource messageSource;

    @GetMapping(value = "/all")
    public PageWrapDto getAllProducts(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return this.productService.findAllProduct(pageable);
    }

    @GetMapping(value = "demo")
    @ResponseBody
    public String getContent(){
        return "demo";
    }

    @GetMapping(value = "/i18n")
    public WrapDataDto getMessageFlowI18n(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        Optional<String> language = Optional.ofNullable(request.getHeader("Accept-Language"));
        Locale locale = Locale.forLanguageTag(language.orElse("fr"));
        String message =  messageSource.getMessage("hi", null, locale );
        return new WrapDataDto(message);
    }
}
