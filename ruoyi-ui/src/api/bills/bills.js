import request from "@/utils/request";

// 查询账单流水列表
export function listBills(query) {
  return request({
    url: 'account/bills/list',
    method: 'get',
    params: query
  })
}

// 查询账单详细
export function getBills(billsId) {
  return request({
    url: '/account/bills/' + billsId,
    method: 'get'
  })
}

// 新增账单
export function addBills(data) {
  return request({
    url: '/account/bills',
    method: 'post',
    data: data
  })
}

// 修改账单
export function updateBills(data) {
  return request({
    url: '/account/bills',
    method: 'put',
    data: data
  })
}

// 删除账单
export function delBills(billsIds) {
  return request({
    url: '/account/bills/' + billsIds,
    method: 'delete'
  })
}
