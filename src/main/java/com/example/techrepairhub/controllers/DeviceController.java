package com.example.techrepairhub.controllers;

import com.example.techrepairhub.models.Device;
import com.example.techrepairhub.services.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping
    public ResponseEntity<List<Device>> getAllDevices() {
        return ResponseEntity.ok(deviceService.findAll());
    }

    @PostMapping
    public ResponseEntity<Device> createDevice(@RequestBody Device device) {
        return ResponseEntity.ok(deviceService.save(device));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDevice(@PathVariable Long id) {
        deviceService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
