package com.itdev.innovativeproject.util;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import com.itdev.innovativeproject.dao.entity.Desktop;
import com.itdev.innovativeproject.dao.entity.DiskType;
import com.itdev.innovativeproject.dao.entity.FormFactor;
import com.itdev.innovativeproject.dao.entity.Notebook;
import com.itdev.innovativeproject.dao.entity.Production;
import com.itdev.innovativeproject.dto.createedit.DesktopCreateEditDto;
import com.itdev.innovativeproject.dto.createedit.NotebookCreateEditDto;

import java.math.BigDecimal;

public class DataTestUtil {

    public static Long getId() {return 100L;}
    public static Long getDiskTypeId() {return 1L;}
    public static Long getDisplayTypeId() {return 2L;}
    public static Long getFormFactorId() {return 3L;}
    public static Long getDesktopId() {return 4L;}
    public static Long getComputerDetailsId() {return 5L;}
    public static String getVideoCard() {return "TestVideoCard";}
    public static DiskType getDiskType() {return new DiskType(getDiskTypeId(), "TestDiskType");}
    public static Integer getDiskCapacity() {return 512;}
    public static String getProcessor() {return "TestProcessor";}
    public static Integer getRam() {return 12;}
    public static Integer getWeight() {return 24;}
    public static ComputerDetails getComputerDetails() {return new ComputerDetails(
            getComputerDetailsId(),
            getVideoCard(),
            getDiskType(),
            getDiskCapacity(),
            getProcessor(),
            getRam(),
            getWeight());}
    public static Long getProductionId() {return 7L;}
    public static String getSerialNumber() {return "TestSerialNumber";}
    public static String getProductionName() {return "TestNameProd";}
    public static Integer getStockQuantity() {return 355;}
    public static String getManufacture() {return "TestManufacture";}
    public static BigDecimal getPrice() {return new BigDecimal(45554);}
    public static Integer getGuarantee() {return 34;}
    public static String getCountry() {return "TestCountry";}
    public static Production getProduction() {return new Production(
            getProductionId(),
            getSerialNumber(),
            getProductionName(),
            getManufacture(),
            getPrice(),
            getStockQuantity(),
            getGuarantee(),
            getCountry());}
    public static Integer getDiagonal() {return 23;}
    public static Notebook getNotebook() {return new Notebook(
            getId(),
            getProduction(),
            getComputerDetails(),
            getDiagonal());}
    public static NotebookCreateEditDto getNotebookCreateEditDto() {return new NotebookCreateEditDto(
            getProductionId(),
            getComputerDetailsId(),
            getDiagonal());}
    public static FormFactor getFormFactor() {return new FormFactor(getFormFactorId(), "TestFormFactor");}
    public static String getScreen() {return "TestScreen";}
    public static Desktop getDesktop() {return new Desktop(
            getDesktopId(),
            getProduction(),
            getFormFactor(),
            getComputerDetails(),
            getScreen());}
    public static DesktopCreateEditDto getDesktopCreateEditDto() {return new DesktopCreateEditDto(
            getProductionId(),
            getFormFactorId(),
            getComputerDetailsId(),
            getScreen());}
}
