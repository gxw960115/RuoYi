package com.ruoyi.web.controller.account;

import com.ruoyi.account.domain.Bills;
import com.ruoyi.account.service.IBillsService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account/bills")
public class BillsController extends BaseController {
    @Autowired
    private IBillsService billsService;

    @PreAuthorize("@ss.hasPermi('account:bills:list')")
    @GetMapping("/list")
    public TableDataInfo selectBills(Bills bills) {
        startPage();
        List<Bills> bills1 = billsService.selectBills(bills);
        return getDataTable(bills1);
    }

    @PreAuthorize("@ss.hasPermi('account:bills:query')")
    @GetMapping(value = "/{billsId}")
    public AjaxResult getInfo(@PathVariable Long billsId) {
        return AjaxResult.success(billsService.selectBillsById(billsId));
    }

    /**
     * 新增账单
     */
    @PreAuthorize("@ss.hasPermi('account:bills:add')")
    @Log(title = "家庭账单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody Bills bills) {
        return toAjax(billsService.insertBills(bills));
    }

    /**
     * @param bills
     * @return
     */
    @PreAuthorize("@ss.hasPermi('account:bills:edit')")
    @Log(title = "家庭账单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Bills bills) {
//        notice.setUpdateBy(getUsername());
        return toAjax(billsService.updateBills(bills));
    }

    /**
     * 删除账单
     */
    @PreAuthorize("@ss.hasPermi('account:bills:remove')")
    @Log(title = "家庭账单", businessType = BusinessType.DELETE)
    @DeleteMapping("/{billsId}")
    public AjaxResult remove(@PathVariable Long[] billsId) {
        return toAjax(billsService.deleteBills(billsId));
    }
}
