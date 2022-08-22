package com.ruoyi.web.controller.account;

import com.ruoyi.account.domain.AccountBook;
import com.ruoyi.account.service.IAccountBookService;
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
@RequestMapping("/account/summary")
public class AccountBookController extends BaseController {

    @Autowired
    private IAccountBookService accountBookService;

    @PreAuthorize("@ss.hasPermi('account:sumary:list')")
    @GetMapping("/list")
    public TableDataInfo selectAccount(AccountBook accountBook) {
        startPage();
        List<AccountBook> accountBook1 = accountBookService.selectAccount(accountBook);
        return getDataTable(accountBook1);
    }

    @PreAuthorize("@ss.hasPermi('account:sumary:query')")
    @GetMapping(value = "/{accountId}")
    public AjaxResult getInfo(@PathVariable Long accountId) {
        return AjaxResult.success(accountBookService.selectAccountById(accountId));
    }

    /**
     * 新增通知公告
     */
    @PreAuthorize("@ss.hasPermi('account:sumary:add')")
    @Log(title = "家庭账单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody AccountBook accountBook) {
        return toAjax(accountBookService.saveAccount(accountBook));
    }

    /**
     * @param accountBook
     * @return
     */
    @PreAuthorize("@ss.hasPermi('account:sumary:edit')")
    @Log(title = "家庭账单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody AccountBook accountBook) {
//        notice.setUpdateBy(getUsername());
        return toAjax(accountBookService.updateAccount(accountBook));
    }

    /**
     * 删除通知公告
     */
    @PreAuthorize("@ss.hasPermi('account:sumary:remove')")
    @Log(title = "家庭账单", businessType = BusinessType.DELETE)
    @DeleteMapping("/{accountIds}")
    public AjaxResult remove(@PathVariable Long[] accountIds) {
        return toAjax(accountBookService.deleteAccountByIds(accountIds));
    }

}
