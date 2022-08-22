import request from '@/utils/request'

// 查询账单列表
export function listAccount(query) {
  return request({
    url: '/account/summary/list',
    method: 'get',
    params: query
  })
}

// 查询账单详细
export function getAccount(accountId) {
  return request({
    url: '/account/summary/' + accountId,
    method: 'get'
  })
}

// 新增账单
export function addAccount(data) {
  return request({
    url: '/account/summary',
    method: 'post',
    data: data
  })
}

// 修改账单
export function updateAccount(data) {
  return request({
    url: '/account/summary',
    method: 'put',
    data: data
  })
}

// 删除账单
export function delAccount(accountIds) {
  return request({
    url: '/account/summary/' + accountIds,
    method: 'delete'
  })
}