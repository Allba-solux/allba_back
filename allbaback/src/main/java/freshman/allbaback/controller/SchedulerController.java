package freshman.allbaback.controller;

import org.json.JSONObject;
import freshman.allbaback.service.SchedulerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/company")
@RequiredArgsConstructor
@RestController
public class SchedulerController {
    private final SchedulerService schedulerService;

    @GetMapping("/f")
    public List<Map<String, Object>> Schedule() {
        List<Map<String, Object>> list = null;

        JSONPObject jsonpObject = new JSONPObject();
        JSONArray jsonArr = new JSONArray();

    }
}
