package com.itdev.innovativeproject.controller;

import com.itdev.innovativeproject.dto.createedit.ProductionCreateEditDto;
import com.itdev.innovativeproject.dto.read.*;
import com.itdev.innovativeproject.enums.TypeProducts;
import com.itdev.innovativeproject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductionService productionService;
    @Autowired
    private MonitorService monitorService;
    @Autowired
    private DesktopService desktopService;
    @Autowired
    private NotebookService notebookService;
    @Autowired
    private DriveService driveService;


    @PostMapping
    public void createProduct(ProductionCreateEditDto productionCreateEditDto) {
        productionService.createProduction(productionCreateEditDto);
    }

    @PutMapping
    public void editProduct(@RequestParam Long productId, @RequestBody ProductionCreateEditDto productionCreateEditDto) {
        productionService.updateProduction(productId, productionCreateEditDto);
    }

    @GetMapping
    public String getProduct(@RequestParam String type, Model model) {
//        if (TypeProducts.Monitor.name().equals(type)) {
//            List<MonitorReadDto> monitors = monitorService.findAll();
//            model.addAttribute("products", monitors);
//            return "catalog";
//        }
//
//        if (TypeProducts.Desktop.name().equals(type)) {
//            List<DesktopReadDto> desktops = desktopService.findAll();
//            model.addAttribute("products", desktops);
//            return "catalog";
//        }
//
//        if (TypeProducts.Notebook.name().equals(type)) {
//            List<NotebookReadDto> notebooks = notebookService.findAll();
//            model.addAttribute("products", notebooks);
//            return "catalog";
//        }
//
//        if (TypeProducts.Drive.name().equals(type)) {
//            List<DriveReadDto> drives = driveService.findAll();
//            model.addAttribute("products", drives);
//            return "catalog";
//        }
        List<ProductionReadDto> productions = productionService.findAll();
        model.addAttribute("products", productions);
        return "catalog";
    }

    @GetMapping
    public ProductionReadDto getProduct(@RequestParam Long productId) {
        return productionService.findById(productId).orElse(new ProductionReadDto());
    }

    @DeleteMapping
    public void deleteProduct(@RequestParam Long productId) {
        productionService.deleteProduction(productId);
    }
}
