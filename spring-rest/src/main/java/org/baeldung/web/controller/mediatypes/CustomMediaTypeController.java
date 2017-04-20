package org.nklkarthi.web.controller.mediatypes;

import org.nklkarthi.web.dto.nklkarthiItem;
import org.nklkarthi.web.dto.nklkarthiItemV2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/", produces = "application/vnd.nklkarthi.api.v1+json")
public class CustomMediaTypeController {

    @RequestMapping(method = RequestMethod.GET, value = "/public/api/items/{id}", produces = "application/vnd.nklkarthi.api.v1+json")
    public @ResponseBody nklkarthiItem getItem(@PathVariable("id") String id) {
        return new nklkarthiItem("itemId1");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/public/api/items/{id}", produces = "application/vnd.nklkarthi.api.v2+json")
    public @ResponseBody nklkarthiItemV2 getItemSecondAPIVersion(@PathVariable("id") String id) {
        return new nklkarthiItemV2("itemName");
    }
}
